# Zodiaco con el Componente de Navegación
Ejemplo de uso del componente de navegación de Android

1. Básicamente, se añade un recurso de tipo navegación con los dos fragmentos conectados.
Importante el id de las acciones (las flechas)
2. Se añade el NavHost en el activity_main. Es un FragmentContainerView con el name con el nombre cualificado de la clase


      androidx.navigation.fragment.NavHostFragment
Debe tener su id, y los atributos app:defaultNavHost a true y app:navGraph apuntando al grafo de navegación (@navigation/...)
3. Tras ello, hay que llamar a la acción configurada (la transición de un fragmento a otro). Se puede hacer de varias formas. En esta aplicación la lógica de esto está en al ListFragment. 

    
