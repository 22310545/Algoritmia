package practica1;

public class Lista
{

    Nodo last;

    public Lista()
    {
        last = null;
    }

    public boolean isEmpty()
    {
        if (last != null)
            return false;
        return true;
    }

    public void encolar(int dato)
    {
        Nodo nuevo;

        if(isEmpty())
        {
            nuevo = new Nodo(dato, null);
            last = nuevo;
            System.out.println("Se ha agregado el primer elemento. El elemento es "+dato);
        }
        else
        {
            nuevo = new Nodo(dato, last);
            last = nuevo;
            System.out.println("Se ha agregado el elemento "+dato);
        }
    }

    public void desencolar()
    {
        if(isEmpty())
        {
            System.out.println("La lista esta vacia");
        }
        else
        {
            int dato = last.getDato();

            last = last.getSiguiente();

            System.out.println("Se ha eliminado el dato "+dato);
        }
    }

    public void mostrar()
    {
        Nodo temporal = last;

        if (isEmpty())
        {
            System.out.println("La lista esta vacia");
        }
        else
        {
            int iterador = 1;

            while (temporal != null)
            {
                System.out.println("El dato es "+temporal.getDato()+ " en la posicion "+iterador);
                temporal = temporal.getSiguiente();
                iterador++;
            }
        }
    }
}
