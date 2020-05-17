import { AdminService } from './../../services/admin.service';
import { Admin } from './../../models/admin';

import { Router } from '@angular/router';

import { Component, OnInit } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import Swal from 'sweetalert2';
import { DomSanitizer } from '@angular/platform-browser';

@Component({
  selector: 'app-table-list',
  templateUrl: './table-list.component.html',
  styleUrls: ['./table-list.component.css']
})
export class TableListComponent implements OnInit {
// admins = [];
statutAdmin:boolean=false;
myAdmin:Admin;
admin :Admin ={
  username:null,
  password:null,
  role:null,
}
admins:any[] = [];
  constructor(private _adminService: AdminService,private _router:Router, private sanitizer: DomSanitizer) { }

  ngOnInit() {
    this._adminService.getAdmins().subscribe((res: any) => {
      this.admins = res
    },
     err => console.log(err)
    )
  }
  editeAdmin(admin) {
    this.statutAdmin=true
    this.myAdmin=admin;
    // this.villeForm = ville;
    // this.changeToUpdate = true;
  }
  //modifier
  modifierAdmin(id , admin){
    this._adminService.modifierAdmin(id,admin).subscribe(res => { 
      Swal.fire({
        icon: 'success',
        title: 'Your artical was updated successfully'
      })
      this.ngOnInit();
      this.statutAdmin=false
    })
    err => console.log(err) 
  }
   //suprimer
   suprimerAdmin(id){
    Swal.fire({
      title: 'Are you sure?',
      text: 'You will not be able to recover this imaginary file!',
      icon: 'question',
      timer: 6000,
      showCancelButton: true,
      confirmButtonText: 'Yes, delete it!',
      cancelButtonText: 'No, keep it'
    }).then((result) => {
      if (result.value) {
        this._adminService.suprimerAdmin(id).subscribe(() => {
          this.ngOnInit();
        });
        Swal.fire({
          title: 'Deleted!',
          text: 'Your artical has been deleted.',
          icon: 'success',
          timer: 5000,
        })
      } else if (result.dismiss === Swal.DismissReason.cancel) {
        Swal.fire(
          'Cancelled',
          'Your artical is safe :)',
          'error'
        )
      }
    })
  }
}
