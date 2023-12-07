package com.ichords.app.modules.homepage.`data`.model

import com.ichords.app.R
import com.ichords.app.appcomponents.di.MyApp
import kotlin.String

data class HomePage1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBobMarleyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_bob_marley)

)
