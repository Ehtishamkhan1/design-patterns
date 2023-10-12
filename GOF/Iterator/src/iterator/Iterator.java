/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author FA20-BSE-039
 */
interface Iterator {
   boolean hasNext();
   Student next();
   boolean hasPrevious();
   Student previous();
   void moveToFirst();
   void moveToLast();
}