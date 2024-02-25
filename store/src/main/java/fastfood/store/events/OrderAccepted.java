package fastfood.store.events;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
public class OrderAccepted {
    private String eventType;
    private Long id;
    private Long orderId;
    private String userId;
    private Long menuId;
    private String menuName;
    private Integer qty;
    private String address;
    private String status;
    private Date cookingDt;

    public OrderAccepted() {
        this.eventType = this.getClass().getSimpleName();
    }    
}