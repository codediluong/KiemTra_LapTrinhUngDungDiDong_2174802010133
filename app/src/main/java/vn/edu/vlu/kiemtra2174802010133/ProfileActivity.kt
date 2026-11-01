package vn.edu.vlu.kiemtra2174802010133

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/** Câu 2 - Nhận dữ liệu Email từ Intent qua Bundle và xử lý Đăng xuất. */
class ProfileActivity : AppCompatActivity() {
    companion object { const val EXTRA_EMAIL = "extra_email" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val tvEmail = findViewById<TextView>(R.id.tvProfileEmail)
        val btnLogout = findViewById<Button>(R.id.btnLogout)
        // Intent extras là một Bundle, lấy lại Email từ LoginActivity.
        val email = intent.extras?.getString(EXTRA_EMAIL).orEmpty()
        tvEmail.text = email
        btnLogout.setOnClickListener { finish() }
    }
}
