import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PracticienComponent } from './practicien.component';

describe('PracticienComponent', () => {
  let component: PracticienComponent;
  let fixture: ComponentFixture<PracticienComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PracticienComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PracticienComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
