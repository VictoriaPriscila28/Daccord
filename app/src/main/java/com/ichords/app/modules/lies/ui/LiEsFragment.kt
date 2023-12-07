package com.ichords.app.modules.lies.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.ichords.app.R
import com.ichords.app.appcomponents.base.BaseFragment
import com.ichords.app.databinding.FragmentLiEsBinding
import com.ichords.app.modules.lies.`data`.model.LiEsRowModel
import com.ichords.app.modules.lies.`data`.viewmodel.LiEsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LiEsFragment : BaseFragment<FragmentLiEsBinding>(R.layout.fragment_li_es) {
  private val viewModel: LiEsVM by viewModels<LiEsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val liesAdapter = LiesAdapter(viewModel.liesList.value?:mutableListOf())
    binding.recyclerLies.adapter = liesAdapter
    liesAdapter.setOnItemClickListener(
    object : LiesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : LiEsRowModel) {
        onClickRecyclerLies(view, position, item)
      }
    }
    )
    viewModel.liesList.observe(requireActivity()) {
      liesAdapter.updateData(it)
    }
    binding.liEsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerLies(
    view: View,
    position: Int,
    item: LiEsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LI_ES_FRAGMENT"


    fun getInstance(bundle: Bundle?): LiEsFragment {
      val fragment = LiEsFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
