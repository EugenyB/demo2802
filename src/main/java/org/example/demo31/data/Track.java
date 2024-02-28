package org.example.demo31.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Track {
    private int id;
    private String name;
    private int duration;
    private double price;
}
