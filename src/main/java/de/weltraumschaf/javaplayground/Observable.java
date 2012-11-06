/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.weltraumschaf.javaplayground;

/**
 *
 * @author sven.strittmatter
 */
public interface Observable {
    
    void addObserver(final Observer o);
    void removeObserver(final Observer o);
    
}
