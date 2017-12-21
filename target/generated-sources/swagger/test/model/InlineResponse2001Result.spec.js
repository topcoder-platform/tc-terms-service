/**
 * ap-terms-microservice
 * Services that provide access and interaction with terms. 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.ApTermsMicroservice);
  }
}(this, function(expect, ApTermsMicroservice) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new ApTermsMicroservice.InlineResponse2001Result();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('InlineResponse2001Result', function() {
    it('should create an instance of InlineResponse2001Result', function() {
      // uncomment below and update the code to test InlineResponse2001Result
      //var instane = new ApTermsMicroservice.InlineResponse2001Result();
      //expect(instance).to.be.a(ApTermsMicroservice.InlineResponse2001Result);
    });

    it('should have the property success (base name: "success")', function() {
      // uncomment below and update the code to test the property success
      //var instane = new ApTermsMicroservice.InlineResponse2001Result();
      //expect(instance).to.be();
    });

    it('should have the property status (base name: "status")', function() {
      // uncomment below and update the code to test the property status
      //var instane = new ApTermsMicroservice.InlineResponse2001Result();
      //expect(instance).to.be();
    });

    it('should have the property metadata (base name: "metadata")', function() {
      // uncomment below and update the code to test the property metadata
      //var instane = new ApTermsMicroservice.InlineResponse2001Result();
      //expect(instance).to.be();
    });

    it('should have the property content (base name: "content")', function() {
      // uncomment below and update the code to test the property content
      //var instane = new ApTermsMicroservice.InlineResponse2001Result();
      //expect(instance).to.be();
    });

  });

}));
