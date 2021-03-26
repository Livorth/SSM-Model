package cn.livroth.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books {
    private String bookID;
    private String bookName;
    private int bookCounts;
    private String detail;

}
