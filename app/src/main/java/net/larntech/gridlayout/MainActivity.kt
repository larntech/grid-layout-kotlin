package net.larntech.gridlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        card_users.setOnClickListener {

            val intent = Intent(this,UsersActivity::class.java);
            startActivity(intent);

        }


        card_add_users.setOnClickListener {

            val intent = Intent(this,AddUsersActivity::class.java);
            startActivity(intent);

        }

    }
}