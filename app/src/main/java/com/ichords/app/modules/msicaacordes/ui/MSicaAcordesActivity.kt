package com.ichords.app.modules.msicaacordes.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ichords.app.R
import com.ichords.app.appcomponents.base.BaseActivity
import com.ichords.app.databinding.ActivityMSicaAcordesBinding
import com.ichords.app.modules.msicaacordes.`data`.model.StaggeredeRowModel
import com.ichords.app.modules.msicaacordes.`data`.viewmodel.MSicaAcordesVM
import com.ichords.app.modules.msicaletra.ui.MSicaLetraActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MSicaAcordesActivity :
    BaseActivity<ActivityMSicaAcordesBinding>(R.layout.activity_m_sica_acordes) {
  private val viewModel: MSicaAcordesVM by viewModels<MSicaAcordesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val staggeredeAdapter = StaggeredeAdapter(viewModel.staggeredeList.value?:mutableListOf())
    binding.recyclerStaggerede.adapter = staggeredeAdapter
    staggeredeAdapter.setOnItemClickListener(
    object : StaggeredeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : StaggeredeRowModel) {
        onClickRecyclerStaggerede(view, position, item)
      }
    }
    )
    viewModel.staggeredeList.observe(this) {
      staggeredeAdapter.updateData(it)
    }
    binding.mSicaAcordesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.txtLetra.setOnClickListener {
      val destIntent = MSicaLetraActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerStaggerede(
    view: View,
    position: Int,
    item: StaggeredeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "M_SICA_ACORDES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MSicaAcordesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
