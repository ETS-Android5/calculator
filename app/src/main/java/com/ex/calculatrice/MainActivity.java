package com.ex.calculatrice;

import androidx.appcompat.app.AppCompatActivity;
import org.mariuszgromada.math.mxparser.*;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    EditText editText ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         editText = findViewById(R.id.text);

         editText.setShowSoftInputOnFocus(false);
editText.setOnClickListener(new View.OnClickListener(){
    @Override
    public void onClick(View view) {

    }
});

    }
    //this function allows us to add a string within a existed string
    private void updateText (String strTOAdd) {
        String oldStr = editText.getText ().toString ();
        int cursorPos = editText.getSelectionStart ();
        String leftStr = oldStr.substring (0, cursorPos);
        String rightStr= oldStr.substring (cursorPos);
        editText.setText (String.format("%s%s%s", leftStr, strTOAdd,rightStr));
        editText.setSelection(cursorPos+1);
    }
    public void zeroBTN(View view) {
        updateText ("0");
    }
    public void unBTN(View view) {
        updateText ("1");
    }
    public void deuxBTN(View view) {
        updateText ("2");
    }
    public void troisBTN(View view) {
        updateText ("3");
    }
    public void quatreBTN(View view) {
        updateText ("4");
    }
    public void cinqBTN(View view) {
        updateText ("5");
    }
    public void sixBTN(View view) {
        updateText ("6");
    }
    public void septBTN(View view) {
        updateText ("7");
    }
    public void huitBTN(View view) {
        updateText ("8");
    }
    public void neufBTN(View view) {
        updateText ("9");
    }
    public void plusBTN(View view) {
        updateText ("+");
    }
    public void moinBTN(View view) {
        updateText ("-");
    }
    public void multBTN(View view) {
        updateText ("*");
    }
    public void devideBTN(View view) {
        updateText ("/");
    }
    //the expression entred is evaluated using MXParser library
    public void egalBTN(View view) {
Expression exp = new Expression(editText.getText().toString());
String result = String.valueOf(exp.calculate());
editText.setText(result);
        editText.setSelection (result.length ());

    }
    public void expBTN(View view) {
        updateText ("^");
    }
    public void parBTN(View view) {
        int cursorPos =editText.getSelectionStart();
        int openPar =0;
        int closedPar =0;
        int textLen =editText.getText ().length ();
        //count number of parentheses
        for (int i = 0; i < cursorPos; i++){
            if (editText.getText ().toString ().substring (i, i+1).equals ("(")) {
                openPar ++;}
                if (editText.getText().toString().substring(i, i + 1).equals(")")) {
                    closedPar ++;
                }
            }
        //inserting the appropriate parenthese
        if (openPar == closedPar || editText.getText ().toString ().substring (textLen-1,textLen).equals ("(")){
            updateText (  "(");
            editText.setSelection(cursorPos + 1);
        }
        else if (openPar > closedPar || !editText.getText ().toString ().substring (textLen-1,textLen).equals ("(")){
            updateText (  ")");
            editText.setSelection(cursorPos + 1);
        }
        editText.setSelection(cursorPos + 1);
}
    public void clearBTN(View view) {
editText.getText().clear();
    }
    public void deleteBTN(View view) {
//delete the character before the position of cursor
        int cursorPos = editText.getSelectionStart();
        int textLen = editText.getText().length();
        if (cursorPos != 0 && textLen != 0) {
            SpannableStringBuilder selection = (SpannableStringBuilder) editText.getText();
            selection.replace(cursorPos - 1, cursorPos, "");
            editText.setText(selection);
            editText.setSelection(cursorPos - 1);

        }
    }

}