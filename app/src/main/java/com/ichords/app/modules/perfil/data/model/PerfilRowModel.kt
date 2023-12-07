package com.ichords.app.modules.perfil.`data`.model

import com.ichords.app.R
import com.ichords.app.appcomponents.di.MyApp
import kotlin.String

data class PerfilRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtConcluaaomeno: String? =
      MyApp.getInstance().resources.getString(R.string.msg_conclua_ao_meno)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForty: String? = MyApp.getInstance().resources.getString(R.string.lbl_40)

)
