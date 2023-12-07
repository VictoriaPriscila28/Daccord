package com.ichords.app.modules.lies.`data`.model

import com.ichords.app.R
import com.ichords.app.appcomponents.di.MyApp
import kotlin.String

data class LiEsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLies: String? = MyApp.getInstance().resources.getString(R.string.lbl_li_es)

)
