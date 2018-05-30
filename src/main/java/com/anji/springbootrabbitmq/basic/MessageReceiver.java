package com.anji.springbootrabbitmq.basic;

import com.rabbitmq.client.Channel;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;

/**
 * Description:
 * author: chenqiang
 * date: 2018/5/28 20:48
 */


public class MessageReceiver implements ChannelAwareMessageListener {

    public void onMessage(Message message, Channel channel) throws Exception {
        try {
            byte[] body = message.getBody();
            System.out.println(">>> receive: {}" + new String(body));
        } finally {
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        }
    }
}
