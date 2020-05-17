import { RoleService } from './../../services/role.service';
import { Admin } from './../../models/admin';
import { Role } from './../../models/role';
import { FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { AuthentificationService } from 'src/app/services/authentification.service';


@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.scss']
})
export class SignUpComponent implements OnInit {
  public userfile: any = File;

  // registerUserData = {}
 signupForm = this.formBuilder.group({
    username: [''],
    password: [''],
    role:['']
  });
  roles:any[] = [];
  fileData: File = null;
previewUrl:any = null;
fileUploadProgress: string = null;
uploadedFilePath: string = null;
  constructor(private authenticationService:AuthentificationService,
    private _router: Router,
    private formBuilder:FormBuilder,
    private _roleService: RoleService) { }

    ngOnInit() {
      this._roleService.getRoles().subscribe((res: Role[]) => {
        this.roles = res
        console.log(this.roles)
      },
       err => console.log(err)
      )
    }
    //tetstst


  registerUser(data) {
    let _role = new Role(data.role);
    let _admin= new Admin(null,data.username,data.password,_role)  
    this.authenticationService.Registre(_admin)
    .subscribe(
      (res:Admin[]) => {
        console.log(res)
        this._router.navigate(['/sign-in'])
      },
      err => console.log(err)
    )      
  } 
  
 
}
