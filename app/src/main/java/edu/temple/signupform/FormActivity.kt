package edu.temple.signupform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class FormActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Name :String
        var emailAddress : String
        val password : String
        val passwordConfirmation: String

        val inputName = findViewById<TextView>(R.id.editTextViewName)
        val inputEmail = findViewById<TextView>(R.id.TextViewEmail)
        val inputPassword = findViewById<TextView>(R.id.editTextTextPassword)
        val inputPasswordConfirm = findViewById<TextView>(R.id.editTextTextPasswordConfirm)
        val saveButton = findViewById<Button>(R.id.buttonSave)

        saveButton.setOnClickListener() {
            isNoEntry(inputName,"Name")
            isNoEntry(inputEmail, "Email")
            isNoEntry(inputPassword, "Password")
            isNoEntry(inputPasswordConfirm, "Confirm Password")

        }


    }

    private fun isNoEntry(view: TextView, name:String) {
        if(view.text.isNotEmpty()){}
        else{view.setError("${name} Cannot Be Blank")}
    }


}