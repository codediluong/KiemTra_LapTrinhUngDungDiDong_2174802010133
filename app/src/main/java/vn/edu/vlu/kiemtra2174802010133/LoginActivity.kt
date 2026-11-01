package vn.edu.vlu.kiemtra2174802010133

import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/** Câu 1 - Xác thực dữ liệu, bắt buộc ánh xạ bằng findViewById. */
class LoginActivity : AppCompatActivity() {
    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var tvStatus: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edtEmail = findViewById(R.id.edtEmail)
        edtPassword = findViewById(R.id.edtPassword)
        tvStatus = findViewById(R.id.tvStatus)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener { validateLogin() }
    }

    private fun validateLogin() {
        val email = edtEmail.text.toString().trim()
        val password = edtPassword.text.toString()
        val errorMessage = when {
            email.isEmpty() && password.isEmpty() -> R.string.error_both
            email.isEmpty() -> R.string.error_email_empty
            password.isEmpty() -> R.string.error_password_empty
            !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> R.string.error_email_format
            password.length < 6 -> R.string.error_password_length
            else -> null
        }
        if (errorMessage != null) {
            tvStatus.setText(errorMessage)
            tvStatus.setTextColor(getColor(R.color.error))
            return
        }
        tvStatus.setText(R.string.status_success)
        tvStatus.setTextColor(getColor(R.color.success))
    }
}
