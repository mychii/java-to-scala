/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mychii.app.javatoscala;

import java.io.File;

/**
 *
 * @author CHII
 */
public class IFile extends File {

    public IFile(String path) {
        super(path);
    }

    public IFile(File file) {
        super(file.getAbsolutePath());
    }

    IFile find(String name) {
        for (File file : this.listFiles()) {
            if (name.equals(file.getName())) {
                return new IFile(file.getAbsolutePath());
            }
        }
        return null;
    }

    boolean hasFile(String name) {
        return find(name) != null;
    }
}
