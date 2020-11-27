/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.haircut.quiz;

/**
 *
 * @author amtat
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Program Hasircut Quiz
 */
public interface ServiceItem {
    public void displayService();
    public float getPrice(int serviceItem);
    public boolean checkMemberStatus(String statusMember);
    public float getSale(boolean isMember, float parServicePrice);
}
