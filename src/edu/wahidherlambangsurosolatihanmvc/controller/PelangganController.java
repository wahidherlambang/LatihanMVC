/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wahidherlambangsurosolatihanmvc.controller;

import edu.wahidherlambangsurosolatihanmvc.model.PelangganModel;
import edu.wahidherlambangsurosolatihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
    public void resetForm(PelangganView view){
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail1().getText();
        String notelp = view.getTxtTelp().getText();
        
        if (nama.equals("") && email.equals("") && notelp.equals("")) {
        
        }else {
        
            model.resetForm();
        }
    }
    
    public void simpanForm(PelangganView view){
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail1().getText();
        String notelp = view.getTxtTelp().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        }else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
        }else if (notelp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "NoTelp Masih Kosong");
        }else{
            
            model.simpanForm();
        }
    }
}
