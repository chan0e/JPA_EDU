package jpabasic;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORY_ITEM")
public class CategoyItem {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private Item item;
}
