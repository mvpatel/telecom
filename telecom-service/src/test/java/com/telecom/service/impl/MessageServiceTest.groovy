package com.telecom.service.impl


import spock.lang.Specification

/**
 * Groovy Test to do unit testing of MessageService
 */
class MessageServiceTest extends Specification {
    private MessageService messageService
    def mockMessageRepository = Mock(MessageRepository)
    def userId = 5
    def message = "Hello All!"
    def messageRequest = new MessageRequest(userId: userId, message: message)
    def messageDetails = new Message(id: 2, userId: userId, message: message)

    def setup() {
        messageService = new MessageServiceImpl(mockMessageRepository)
    }

    def "Message added successfully "() {
        when:
        def response = messageService.addMessage(messageRequest)

        then:
        response.getStatus() == 'SUCCESS'
        1 * mockMessageRepository.saveAndFlush(_ as Message) >> messageDetails
    }

    def "Message adding returns error "() {
        when:
        def response = messageService.addMessage(messageRequest)

        then:
        response.getStatus() == 'FAIL'
        1 * mockMessageRepository.saveAndFlush(_ as Message) >> Exception
    }
}