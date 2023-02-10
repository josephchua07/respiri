package com.chua.respiriapp.ui.medication

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.viewpager.widget.ViewPager
import com.chua.respiriapp.R
import com.chua.respiriapp.databinding.FragmentMedicationBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MedicationFragment : Fragment() {

    private var _binding: FragmentMedicationBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private val medicationViewModel: MedicationViewModel by viewModels()
    private lateinit var medicationPagerAdapter: MedicationPagerAdapter
    private lateinit var viewPager: ViewPager

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.medication_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.navigation_medication -> {
                Log.d("medication", "add")
                true
            }
            else -> false
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMedicationBinding.inflate(inflater, container, false)
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        medicationPagerAdapter = MedicationPagerAdapter(childFragmentManager)
        viewPager = binding.pager
        viewPager.adapter = medicationPagerAdapter
        val tabLayout = binding.tabLayout
        tabLayout.setupWithViewPager(viewPager)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}