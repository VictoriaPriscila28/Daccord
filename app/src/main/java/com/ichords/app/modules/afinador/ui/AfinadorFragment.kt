package com.ichords.app.modules.afinador.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.ichords.app.R
import com.ichords.app.appcomponents.base.BaseFragment
import com.ichords.app.databinding.FragmentAfinadorBinding
import com.ichords.app.modules.afinador.`data`.viewmodel.AfinadorVM
import kotlin.String
import kotlin.Unit

class AfinadorFragment : BaseFragment<FragmentAfinadorBinding>(R.layout.fragment_afinador) {
  private val viewModel: AfinadorVM by viewModels<AfinadorVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.afinadorVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "AFINADOR_FRAGMENT"


    fun getInstance(bundle: Bundle?): AfinadorFragment {
      val fragment = AfinadorFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
