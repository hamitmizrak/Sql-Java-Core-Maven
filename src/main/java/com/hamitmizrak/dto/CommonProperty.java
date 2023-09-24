package com.hamitmizrak.dto;

import lombok.*;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// LOMBOK
@Data //@Getter @Setter @ToString @EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
abstract public class CommonProperty implements Serializable {
    public static final Long serialVersionUID=1L;

    // Global Variable
    protected Long id;

    //@Builder.Default // Lombok
    protected Date createdDate=new Date(System.currentTimeMillis());


    // Gövdesiz Method
    public String nowDateData() {
        Locale locale=new Locale("tr","TR");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss",locale);
        Date date=new Date();
        String format=simpleDateFormat.format(date);
        //System.out.println(new Date(System.currentTimeMillis()));
        System.out.println(format);
        return format;
    }

    // Gövdesiz Method
    //abstract public String nowDate();
}//end class
