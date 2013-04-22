/* Generated by Xgen from: E90.05.00 SIR 48700 on: 2006-05-05 08:18 */
/*******************************************************************************
* 2006 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   AcptStratBlkAuctReq.hxx
*
*  DESCRIPTION: Layouts used for
*               Accept Strategy Block Auction Request
*
*******************************************************************************/

#ifndef _ACPTSTRATBLKAUCTREQ_HXX_
#define _ACPTSTRATBLKAUCTREQ_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/


/******************************************************************************/

#ifndef _BSC_ACPT_STRAT_BLK_AUCT_REQ_REQUEST_T_
#define _BSC_ACPT_STRAT_BLK_AUCT_REQ_REQUEST_T_

typedef struct bscAcptStratBlkAuctReqRequestTag
{
    char             buyCod;
    char             ordrNo          [DRIV_ORDR_NO_LEN];
    stratIdGrpT      stratIdGrp;
    trdrIdGrpT       trdrIdGrp;
    char             acptExeQty      [DRIV_QUANTITY_LEN];
    char             blkAuctOrdrExeQty [DRIV_VOLUME_LEN];
    char             ordrExePrc      [DRIV_PRICE_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} bscAcptStratBlkAuctReqRequestT, *pBscAcptStratBlkAuctReqRequestT;

#endif  /* _BSC_ACPT_STRAT_BLK_AUCT_REQ_REQUEST_T_ */

/******************************************************************************/

#ifndef _ACPT_STRAT_BLK_AUCT_REQ_REQUEST_T_
#define _ACPT_STRAT_BLK_AUCT_REQ_REQUEST_T_

typedef struct acptStratBlkAuctReqRequestTag
{
    dataHeaderT      header;
    bscAcptStratBlkAuctReqRequestT basic;
} acptStratBlkAuctReqRequestT, *pAcptStratBlkAuctReqRequestT;

#endif  /* _ACPT_STRAT_BLK_AUCT_REQ_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_ACPT_STRAT_BLK_AUCT_REQ_RESPONSE_T_
#define _BSC_ACPT_STRAT_BLK_AUCT_REQ_RESPONSE_T_

typedef struct bscAcptStratBlkAuctReqResponseTag
{
    stratTrdNoGrpT   stratTrdNoGrp;
    char             blkAuctOrdrExeQty [DRIV_VOLUME_LEN];
    char             ordrExePrc      [DRIV_PRICE_LEN];
    char             ordrNo          [DRIV_ORDR_NO_LEN];
    char             dateLstUpdDat   [DRIV_TIMESTAMP_LEN];
} bscAcptStratBlkAuctReqResponseT, *pBscAcptStratBlkAuctReqResponseT;

#endif  /* _BSC_ACPT_STRAT_BLK_AUCT_REQ_RESPONSE_T_ */

/******************************************************************************/

#ifndef _ACPT_STRAT_BLK_AUCT_REQ_RESPONSE_T_
#define _ACPT_STRAT_BLK_AUCT_REQ_RESPONSE_T_

typedef struct acptStratBlkAuctReqResponseTag
{
    dataHeaderT      header;
    bscAcptStratBlkAuctReqResponseT basic;
} acptStratBlkAuctReqResponseT, *pAcptStratBlkAuctReqResponseT;

#endif  /* _ACPT_STRAT_BLK_AUCT_REQ_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _ACPTSTRATBLKAUCTREQ_HXX_ */

/******************************************************************************/
/* End of file AcptStratBlkAuctReq.hxx */
/******************************************************************************/
