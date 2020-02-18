package br.com.zup.serverdrivenrendering

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.serverdrivenrendering.widget.layout.Vertical
import br.com.zup.serverdrivenrendering.widget.ui.Button
import br.com.zup.serverdrivenrendering.widget.ui.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val widget = MyWidget().create()
        // TODO: DO RENDERING
    }
}
