package thiengo.com.br.fasteremail

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
    }

    /*
     * Para a atualização dos título e ícone de topo
     * esquerdo da Toolbar.
     * */
    override fun onResume() {
        super.onResume()
        toolbar.setNavigationIcon(R.drawable.ic_account_plus_white_24dp)
        toolbar.setTitle("Email social para quem?")
    }

    /*
     * Para o carregamento do XML de menu e assim a
     * apresentação do ícone de "Enviar"
     * */
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
}
