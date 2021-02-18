package com.example.googleauth

import android.os.Bundle
import android.view.View
import androidx.preference.PreferenceFragmentCompat
import androidx.fragment.app.viewModels

class SettingsFragment : PreferenceFragmentCompat(){
    companion object {
        const val TAG = "SettingsFragment"
    }

    // Get a reference to the ViewModel scoped to this Fragment
    private val viewModel by viewModels<LoginViewModel>()

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.settings, rootKey)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}