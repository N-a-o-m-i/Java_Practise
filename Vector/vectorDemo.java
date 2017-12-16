

public static void main (String[] args) {

  Vector v = new Vector();

  v.addElement("Vector01");
  v.addElement("Vector02");
  v.addElement("Vector03");
  v.addElement("Vector04");


  /**

  Enumeration has the same function as Iterator

  */
  Enumeration enum = v.elements();
  while (en.hasMoreElements()) {
    System.out.println("nextElement: " + enum.nextElement());
  }

  Iterator it = v.iterator();
  while (it.hasNext()) {
    System.out.println("next: " + it.next());
  }


}
