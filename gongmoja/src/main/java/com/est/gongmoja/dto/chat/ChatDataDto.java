package com.est.gongmoja.dto.chat;

import com.est.gongmoja.entity.ChatDataEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChatDataDto {

    //    private ChatDataEntity.MessageType type;
    private Long chatRoomId;
    private String sender;
    private String message;
    private String sentTime;
//    private long userId;


}