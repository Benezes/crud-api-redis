package br.com.gabriel.crudredis.service;

import br.com.gabriel.crudredis.model.Invoice;

import java.util.List;

public interface InvoiceService {

    Invoice saveInvoice(Invoice inv);
    Invoice updateInvoice(Invoice inv, Long invId);
    void deleteInvoice(Long invId);
    Invoice getOneInvoice(Long invId);
    List<Invoice> getAllInvoices();

}