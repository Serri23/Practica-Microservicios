package com.practica.cliente.controllers;

import com.practica.cliente.services.ClienteService;
import com.practica.entidadesMySQL.domains.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    //GET
    @GetMapping(value = "/api/cliente/{id}")
    public Optional<Cliente> getCliente(@PathVariable("id") String clienteId){
         return clienteService.getClienteById(clienteId);

    }

    //POST
    @PostMapping(value="/api/cliente/")
    public Cliente anadirCliente(@RequestBody Cliente cliente){
        return clienteService.anadirCliente(cliente);
    }

    //PUT
    @PutMapping(value="/api/cliente/")
    public void actualizarCliente(@RequestBody Cliente clienteU){
        Optional<Cliente> clienteEnBd = clienteService.getClienteById(clienteU.getId());
        if(clienteEnBd != null){
            //clienteU.setId(clienteEnBd.get().getId());
            clienteService.actualizarCliente(clienteU);
        }else{
            try{

            }catch(Exception e) {
                System.out.println("Error: No existe el cliente");
            }
        }
    }

    //DELETE
    @DeleteMapping(value="/api/cliente/{id}")
    public void borrarCliente(@PathVariable("id") String clienteId){
        clienteService.borrarCliente(clienteId);
    }
    //LISTAR
    @GetMapping(value = "/api/clientes")
    public List<Cliente> listarClientes(){
        return clienteService.listarClientes();
    }
    //  Bill fromDB = this.billService.findById(id);
    //        if(fromDB != null) {
    //            b.setId(fromDB.getId());
    //            return this.billService.save(b);
    //        }
    //        return null;
    /*public List<Cliente> findAll() {
        return this.billService.findAll();
    }

    @RequestMapping(value="/bills", method=RequestMethod.POST)
    public Bill saveBill(@RequestBody Bill b) {
        if(b != null)
            return billService.save(b);
        return null;
    }


    @RequestMapping(value = "/bills/{idBill}", method = RequestMethod.GET)
    public Bill findById(@PathVariable("idBill") Integer id) {
        Bill b = this.billService.findById(id);

        if(b != null)
            return b;
        return null;

    }

    @RequestMapping(value="/bills/{idBill}", method=RequestMethod.DELETE)
    public ResponseEntity<Bill> deleteBill(@PathVariable("idBill") Integer id) {
        Bill fromDB = this.billService.findById(id);
        if(fromDB != null) {
            this.billService.deleteBill(fromDB);
            return ResponseEntity.status(HttpStatus.OK).body(fromDB);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @RequestMapping(value="/bills", method=RequestMethod.DELETE)
    public void deleteAllBills() {
        this.billService.deleteAll();
    }

    @RequestMapping(value="/bills/{idBill}", method=RequestMethod.PUT)
    public Bill updateBill(@PathVariable("idBill") Integer id, @RequestBody Bill b) {
        Bill fromDB = this.billService.findById(id);
        if(fromDB != null) {
            b.setId(fromDB.getId());
            return this.billService.save(b);
        }
        return null;
    }*/

}
