import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ReceptionisteComponent } from './receptioniste.component';

describe('ReceptionisteComponent', () => {
  let component: ReceptionisteComponent;
  let fixture: ComponentFixture<ReceptionisteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ReceptionisteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ReceptionisteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
