// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetReunionMissionInfoRsp.proto

package emu.grasscutter.net.proto;

public final class GetReunionMissionInfoRspOuterClass {
  private GetReunionMissionInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetReunionMissionInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetReunionMissionInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ReunionMissionInfo mission_info = 1;</code>
     * @return Whether the missionInfo field is set.
     */
    boolean hasMissionInfo();
    /**
     * <code>.ReunionMissionInfo mission_info = 1;</code>
     * @return The missionInfo.
     */
    emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfo getMissionInfo();
    /**
     * <code>.ReunionMissionInfo mission_info = 1;</code>
     */
    emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfoOrBuilder getMissionInfoOrBuilder();

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 5066
   * Obf: MOKFKGDKEFA
   * </pre>
   *
   * Protobuf type {@code GetReunionMissionInfoRsp}
   */
  public static final class GetReunionMissionInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetReunionMissionInfoRsp)
      GetReunionMissionInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetReunionMissionInfoRsp.newBuilder() to construct.
    private GetReunionMissionInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetReunionMissionInfoRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetReunionMissionInfoRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetReunionMissionInfoRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfo.Builder subBuilder = null;
              if (missionInfo_ != null) {
                subBuilder = missionInfo_.toBuilder();
              }
              missionInfo_ = input.readMessage(emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(missionInfo_);
                missionInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            case 24: {

              retcode_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.internal_static_GetReunionMissionInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.internal_static_GetReunionMissionInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp.class, emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp.Builder.class);
    }

    public static final int MISSION_INFO_FIELD_NUMBER = 1;
    private emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfo missionInfo_;
    /**
     * <code>.ReunionMissionInfo mission_info = 1;</code>
     * @return Whether the missionInfo field is set.
     */
    @java.lang.Override
    public boolean hasMissionInfo() {
      return missionInfo_ != null;
    }
    /**
     * <code>.ReunionMissionInfo mission_info = 1;</code>
     * @return The missionInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfo getMissionInfo() {
      return missionInfo_ == null ? emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfo.getDefaultInstance() : missionInfo_;
    }
    /**
     * <code>.ReunionMissionInfo mission_info = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfoOrBuilder getMissionInfoOrBuilder() {
      return getMissionInfo();
    }

    public static final int RETCODE_FIELD_NUMBER = 3;
    private int retcode_;
    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (missionInfo_ != null) {
        output.writeMessage(1, getMissionInfo());
      }
      if (retcode_ != 0) {
        output.writeInt32(3, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (missionInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getMissionInfo());
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, retcode_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp other = (emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp) obj;

      if (hasMissionInfo() != other.hasMissionInfo()) return false;
      if (hasMissionInfo()) {
        if (!getMissionInfo()
            .equals(other.getMissionInfo())) return false;
      }
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMissionInfo()) {
        hash = (37 * hash) + MISSION_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getMissionInfo().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 5066
     * Obf: MOKFKGDKEFA
     * </pre>
     *
     * Protobuf type {@code GetReunionMissionInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetReunionMissionInfoRsp)
        emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.internal_static_GetReunionMissionInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.internal_static_GetReunionMissionInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp.class, emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (missionInfoBuilder_ == null) {
          missionInfo_ = null;
        } else {
          missionInfo_ = null;
          missionInfoBuilder_ = null;
        }
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.internal_static_GetReunionMissionInfoRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp build() {
        emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp buildPartial() {
        emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp result = new emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp(this);
        if (missionInfoBuilder_ == null) {
          result.missionInfo_ = missionInfo_;
        } else {
          result.missionInfo_ = missionInfoBuilder_.build();
        }
        result.retcode_ = retcode_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp other) {
        if (other == emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp.getDefaultInstance()) return this;
        if (other.hasMissionInfo()) {
          mergeMissionInfo(other.getMissionInfo());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfo missionInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfo, emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfo.Builder, emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfoOrBuilder> missionInfoBuilder_;
      /**
       * <code>.ReunionMissionInfo mission_info = 1;</code>
       * @return Whether the missionInfo field is set.
       */
      public boolean hasMissionInfo() {
        return missionInfoBuilder_ != null || missionInfo_ != null;
      }
      /**
       * <code>.ReunionMissionInfo mission_info = 1;</code>
       * @return The missionInfo.
       */
      public emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfo getMissionInfo() {
        if (missionInfoBuilder_ == null) {
          return missionInfo_ == null ? emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfo.getDefaultInstance() : missionInfo_;
        } else {
          return missionInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.ReunionMissionInfo mission_info = 1;</code>
       */
      public Builder setMissionInfo(emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfo value) {
        if (missionInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          missionInfo_ = value;
          onChanged();
        } else {
          missionInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ReunionMissionInfo mission_info = 1;</code>
       */
      public Builder setMissionInfo(
          emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfo.Builder builderForValue) {
        if (missionInfoBuilder_ == null) {
          missionInfo_ = builderForValue.build();
          onChanged();
        } else {
          missionInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ReunionMissionInfo mission_info = 1;</code>
       */
      public Builder mergeMissionInfo(emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfo value) {
        if (missionInfoBuilder_ == null) {
          if (missionInfo_ != null) {
            missionInfo_ =
              emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfo.newBuilder(missionInfo_).mergeFrom(value).buildPartial();
          } else {
            missionInfo_ = value;
          }
          onChanged();
        } else {
          missionInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ReunionMissionInfo mission_info = 1;</code>
       */
      public Builder clearMissionInfo() {
        if (missionInfoBuilder_ == null) {
          missionInfo_ = null;
          onChanged();
        } else {
          missionInfo_ = null;
          missionInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ReunionMissionInfo mission_info = 1;</code>
       */
      public emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfo.Builder getMissionInfoBuilder() {
        
        onChanged();
        return getMissionInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.ReunionMissionInfo mission_info = 1;</code>
       */
      public emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfoOrBuilder getMissionInfoOrBuilder() {
        if (missionInfoBuilder_ != null) {
          return missionInfoBuilder_.getMessageOrBuilder();
        } else {
          return missionInfo_ == null ?
              emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfo.getDefaultInstance() : missionInfo_;
        }
      }
      /**
       * <code>.ReunionMissionInfo mission_info = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfo, emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfo.Builder, emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfoOrBuilder> 
          getMissionInfoFieldBuilder() {
        if (missionInfoBuilder_ == null) {
          missionInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfo, emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfo.Builder, emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.ReunionMissionInfoOrBuilder>(
                  getMissionInfo(),
                  getParentForChildren(),
                  isClean());
          missionInfo_ = null;
        }
        return missionInfoBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GetReunionMissionInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:GetReunionMissionInfoRsp)
    private static final emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp();
    }

    public static emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetReunionMissionInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetReunionMissionInfoRsp>() {
      @java.lang.Override
      public GetReunionMissionInfoRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetReunionMissionInfoRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetReunionMissionInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetReunionMissionInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetReunionMissionInfoRspOuterClass.GetReunionMissionInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetReunionMissionInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetReunionMissionInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036GetReunionMissionInfoRsp.proto\032\030Reunio" +
      "nMissionInfo.proto\"V\n\030GetReunionMissionI" +
      "nfoRsp\022)\n\014mission_info\030\001 \001(\0132\023.ReunionMi" +
      "ssionInfo\022\017\n\007retcode\030\003 \001(\005B\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.getDescriptor(),
        });
    internal_static_GetReunionMissionInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetReunionMissionInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetReunionMissionInfoRsp_descriptor,
        new java.lang.String[] { "MissionInfo", "Retcode", });
    emu.grasscutter.net.proto.ReunionMissionInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
