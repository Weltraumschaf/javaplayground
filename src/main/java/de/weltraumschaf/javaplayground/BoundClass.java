/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.weltraumschaf.javaplayground;

/**
 *
 * @author sven.strittmatter
 */
public class BoundClass implements Observable {

    @Observed private String foo = "";
    
    @Observed private String bar = "";
    
    @Observed private String baz = "";

    private final ObservableManager mgr = new ObservableManager();

    public BoundClass() {
        super();
        mgr.setObservable(this);
    }
    
    public void addObserver(final Observer o) {
        mgr.addObserver(o);
    }

    public void removeObserver(final Observer o) {
        mgr.removeObserver(o);
    }
    
}
