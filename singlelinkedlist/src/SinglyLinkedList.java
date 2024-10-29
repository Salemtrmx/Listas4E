public class SinglyLinkedList {
    Nodo cabeza;
    SinglyLinkedList(){
        this.cabeza = null;
    }

    public void insertar(Integer valor){
        Nodo nuevoNodo = new Nodo(valor); // Crear el nuevo

        if (cabeza==null) {
            cabeza=nuevoNodo;
        }else {
            Nodo temp= cabeza; // Selecciona el primer nodo.
            //Recorrer los nodos.
            while (temp.siguiente != null) {
                temp=temp.siguiente;
            }
            temp.siguiente = nuevoNodo; //Creación del nuevo nodo.
        }



    }
    
    public void mostrar(){
            Nodo temp= cabeza;
            while (temp!=null) {
                System.out.print(temp.dato + " -> ");
                temp = temp.siguiente;

            } 
            System.out.println("Null");
    }

    public boolean Buscar (Integer valor){
        Nodo nuevoNodo = new Nodo(valor); // Crear el nuevo


        //Verificar si la lista está vacía.

        if (cabeza == null) {
            System.out.println("Vacia como su corazón");
            return false;
        } else {
            Nodo temp = cabeza; // Seleccionar el primer nodo.

            // Recorrer la lista desde la cabeza
            while (temp != null) {
                if (valor.equals(temp.dato)) {
                    return true;
                }
                temp = temp.siguiente;

                }
                return false;
            }

        }
        
}


