package com.example.android_registration

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import com.example.android_registration.databinding.ActivityMainBinding

lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener { CheckInfo() }

    }

    private fun CheckInfo() {


        val name = binding.textView.text
        val email = binding.editTextTextEmailAddress.text
        val date = binding.date1.text
        val pass = binding.editTextTextPassword.text.toString()
        val pass2 = binding.editTextTextPassword2.text.toString()
        val password = pass == pass2
        val gender = when (binding.gender.checkedRadioButtonId) {
            R.id.male -> "male"
            R.id.female -> "female"

            else -> ""
        }
        var information =
            if (name.isNotEmpty() && (email.contains("@") && email.contains(".")) && date.isNotEmpty() && pass.isNotEmpty() && pass2.isNotEmpty() && password) {
                "$name \n $email \n $date \n$gender"

            } else if (!password) {
                "ERROR!!!\nPlease enter all the information"


            } else {

                "ERROR!!!\nPlease enter all the information"


            }
//{//fun returnpass(var password:String) {
//    val password = if (pass != pass2) {
//        println("password not matched")
//    } else {
//        println("password match")
//    }
//    return password
//}


        binding.finalResult.text = information

        //
//        binding.finalResult.text = getString(R.string.name_info, name)
//        binding.finalResult.text = getString(R.string.email_info, Email)

    }


}