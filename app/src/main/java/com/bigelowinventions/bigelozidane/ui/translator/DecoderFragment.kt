package com.bigelowinventions.bigelozidane.ui.translator

import android.content.ClipboardManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bigelowinventions.bigelozidane.databinding.FragmentDecoderBinding
import com.bigelowinventions.bigelozidane.logic.InputManager

class DecoderFragment : Fragment() {

    private var _binding: FragmentDecoderBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val decoderViewModel =
            ViewModelProvider(this).get(DecoderViewModel::class.java)

        _binding = FragmentDecoderBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val inputEditText: EditText = binding.inputEditText
        inputEditText.doOnTextChanged { text, start, before, count ->
            decoderViewModel.inputText.value = text.toString()
        }

        val pasteTextImageButton: ImageView = binding.pasteTextImageButton
        pasteTextImageButton.setOnClickListener {
            val context = requireContext()
            val clipboard = ContextCompat.getSystemService(
                context,
                ClipboardManager::class.java
            ) as ClipboardManager
            binding.inputEditText.setText(InputManager.readFromClipboard(clipboard))
        }

        val outputEditText: EditText = binding.outputEditText
        decoderViewModel.outputText.observe(viewLifecycleOwner) {
            outputEditText.setText(it)
        }

        val copyTextImageButton: ImageView = binding.copyTextImageButton
        copyTextImageButton.setOnClickListener {
            val context = requireContext()
            val clipboard = ContextCompat.getSystemService(context, ClipboardManager::class.java) as ClipboardManager
            InputManager.writeToClipboard(decoderViewModel.outputText.value.toString(), clipboard)
        }

        binding.translateButton.setOnClickListener {
            decoderViewModel.decode()
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}