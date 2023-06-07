package com.example.bottomnavigationview

import android.os.Bundle
import android.view.Menu
import androidx.activity.viewModels
import androidx.appcompat.app.ActionBar
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bottomnavigationview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))

        // アクションバーへツールバーを設定
        setSupportActionBar(binding.toolbar)
        // アクションバー(ツールバー)とナビゲーションを連携
        setupActionBarWithNavController(navController, appBarConfiguration)
        // ボトムナビ と ナビゲーションを連携
        navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // menuInflater.inflate(R.menu.action_menu, menu)
//        val itemswitch = menu.findItem(R.id.switch_action_bar)
//        itemswitch.setActionView(R.layout.use_switch)
//        val sw =
//            menu.findItem(R.id.switch_action_bar).actionView!!.findViewById<View>(R.id.switch2) as Switch
//        sw.setOnCheckedChangeListener { buttonView, isChecked ->
//            if (isChecked) {
//                Toast.makeText(this@MainActivity, "Switch is working", Toast.LENGTH_SHORT).show()
//            }
//        }
        return true
    }


// ツールバーに戻るボタンを設置
// supportActionBar?.setDisplayHomeAsUpEnabled(true)
// supportActionBar!!.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
// supportActionBar!!.setDisplayShowCustomEnabled(true)
// supportActionBar!!.setCustomView(R.layout.action_bar)
// Customize the back button
// supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_launcher_foreground);

// showing the back button in action bar
// supportActionBar?.setHomeButtonEnabled(false)
// supportActionBar?.setDisplayHomeAsUpEnabled(false)
// supportActionBar?.setDisplayShowHomeEnabled(false)


}