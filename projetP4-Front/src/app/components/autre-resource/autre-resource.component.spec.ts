import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AutreResourceComponent } from './autre-resource.component';

describe('AutreResourceComponent', () => {
  let component: AutreResourceComponent;
  let fixture: ComponentFixture<AutreResourceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AutreResourceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AutreResourceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
