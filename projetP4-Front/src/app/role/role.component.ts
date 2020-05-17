import { Role } from './../models/role';
import { RoleService } from './../services/role.service';
import { Validators, FormGroup, FormControl } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-role',
  templateUrl: './role.component.html',
  styleUrls: ['./role.component.scss']
})
export class RoleComponent implements OnInit {

  statutRole:boolean=false;
  statutRole2:boolean=false;
  search: string = "";
  roles:any[] = [];
  role: Role ={
    label:null
  };
  myRole:Role;
  validator: boolean = true;
  
  // villeForm = this.formBuilder.group({
    roleForm = new FormGroup({
    label: new FormControl("", [Validators.required, Validators.minLength(4), Validators.maxLength(20)]),
    });
    constructor(private _roleService: RoleService) { }
  
    ngOnInit() {
      this._roleService.getRoles().subscribe((res: Role[]) => {
        this.roles = res
        console.log(this.roles)
      },
       err => console.log(err)
      )
    }
    //add
    addRoles(){
      console.log("eee"+this.role)
      this._roleService.addRoles(this.role).subscribe(res => {
          // this._router.navigate(['/villes'])
      
          Swal.fire({
            icon: 'success',
            title: 'Your artical was add successfully',
          })
          this.role.label="";
           this.validator = false;
          this.ngOnInit();
          
        })
        err => console.log(err)
    }
    editeRole(role) {
      this.statutRole2=true
      this.myRole=role;
      // this.villeForm = ville;
      // this.changeToUpdate = true;
    }
    //modifier
    modifierRole(id , data){
      this._roleService.modifierRoles(id,data).subscribe(res => { 
        Swal.fire({
          icon: 'success',
          title: 'Your artical was updated successfully'
        })
        this.validator = false;
        this.ngOnInit();
        this.roleForm.reset
        this.statutRole2=false
      })
      err => console.log(err) 
    }
    //suprimer
    suprimerRole(id){
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
          this._roleService.suprimerRoles(id).subscribe(() => {
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
