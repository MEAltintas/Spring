package yte.intern.spring_web;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String isim;
    private String soyisim;
    private int yas;

    public void incrementYas() {
        this.yas++;
    }
}
