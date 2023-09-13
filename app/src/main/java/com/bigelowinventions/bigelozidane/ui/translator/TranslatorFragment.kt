package com.bigelowinventions.bigelozidane.ui.translator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bigelowinventions.bigelozidane.databinding.FragmentHomeBinding

class TranslatorFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val translatorViewModel =
            ViewModelProvider(this).get(TranslatorViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val inputEditText: EditText = binding.inputEditText
        translatorViewModel.inputText.observe(viewLifecycleOwner) {
            inputEditText.setText(it)
        }

        val outputEditText: EditText = binding.outputEditText
        translatorViewModel.outputText.observe(viewLifecycleOwner) {
            outputEditText.setText(it)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}