package br.com.zup.serverdrivenrendering

class JsonProvider {

    fun provide(): String = """
        {
           "_componentName_":"vertical",
           "children":[
              {
                 "_componentName_":"text",
                 "text":"Hello world"
              },
              {
                 "_componentName_":"text",
                 "text":"From Server!"
              },
              {
                 "_componentName_":"button",
                 "text":"Continue"
              }
           ]
        }
    """.trimIndent()
}