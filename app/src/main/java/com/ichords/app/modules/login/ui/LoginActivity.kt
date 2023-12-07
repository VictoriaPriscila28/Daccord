package com.ichords.app.modules.login.ui

import androidx.activity.viewModels
import com.ichords.app.R
import com.ichords.app.appcomponents.base.BaseActivity
import com.ichords.app.databinding.ActivityLoginBinding
import com.ichords.app.modules.homepagecontainer.ui.HomePageContainerActivity
import com.ichords.app.modules.login.`data`.viewmodel.LoginVM
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnEntrar.setOnClickListener {
      val destIntent = HomePageContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGIN_ACTIVITY"

  }
}
