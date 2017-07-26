package br.ufrn.eaj.tads.hellotads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

    Context c = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imagem = (ImageView) findViewById(R.id.imagemView);
        imagem.setImageResource(R.drawable.smile);

        /*
        Button btLogin = (Button) findViewById(R.id.botao);
        btLogin.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //implementar
            }
        });
        */

        //Button btLogin = (Button) findViewById(R.id.botao);
        //btLogin.setOnClickListener (meuListener);
    }


    /*
    private View.OnClickListener meuListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            EditText edit = (EditText) findViewById(R.id.texto);
            Toast.makeText(c, edit.getText(), Toast.LENGTH_SHORT).show();
        }
    };
    */


    /*
    public void clique(View v){
        EditText edit = (EditText) findViewById(R.id.texto);
        Toast.makeText(this, edit.getText(), Toast.LENGTH_SHORT).show();
    }
    */
}
