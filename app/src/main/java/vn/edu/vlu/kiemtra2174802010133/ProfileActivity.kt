package vn.edu.vlu.kiemtra2174802010133

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/** Câu 3 - ListView, ArrayAdapter và Toast khi chọn phần tử. */
class ProfileActivity : AppCompatActivity() {
    companion object { const val EXTRA_EMAIL = "extra_email" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val tvEmail = findViewById<TextView>(R.id.tvProfileEmail)
        val btnLogout = findViewById<Button>(R.id.btnLogout)
        val listSubjects = findViewById<ListView>(R.id.listSubjects)

        tvEmail.text = intent.extras?.getString(EXTRA_EMAIL).orEmpty()
        btnLogout.setOnClickListener { finish() }

        val subjects = listOf(
            "Lập trình Kotlin",
            "Thiết kế Layout XML",
            "Quản lý Git/GitHub",
            "Xử lý Intent",
            "Kiến trúc Android"
        )
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, subjects)
        listSubjects.adapter = adapter
        listSubjects.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, "Bạn chọn: ${subjects[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}
