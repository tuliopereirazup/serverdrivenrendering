package br.com.zup.serverdrivenrendering

import br.com.zup.serverdrivenrendering.widget.core.Widget
import br.com.zup.serverdrivenrendering.widget.layout.Vertical
import br.com.zup.serverdrivenrendering.widget.ui.Button
import br.com.zup.serverdrivenrendering.widget.ui.Text

class WidgetProvider {

    fun provide(): Widget {
        return Vertical(
            children = listOf(
                Text("Hello world"),
                Text("From Server!"),
                Button("Continue")
            )
        )
    }
}