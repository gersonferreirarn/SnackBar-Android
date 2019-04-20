package br.com.caicosoft.snackbar;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAbrir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAbrir = findViewById(R.id.btnAbrir);

        // TEM QUE IMPLEMENTAR A DEPENDENCIA NO GRADLE implementation 'com.android.support:design:28.0.0'

        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSnackBar(v);
            }
        });
    }

    public void abrirSnackBar(View v){
        Snackbar.make(v, "Botão Pressionado", Snackbar.LENGTH_LONG)
                .setAction("Confirmar", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        acaoSnackBar();
                    }
                }) // ACTION eh uma ação (TextoDoBotao, AcaoAFazer)
                .setActionTextColor(getResources().getColor(R.color.colorWhite)) // Altera a cor do botão do ACTION BAR
                .show();
    }

    public void acaoSnackBar(){
        btnAbrir.setText("Botão Alterado");
    }
}
